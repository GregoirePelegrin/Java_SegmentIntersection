public class Test {
    private static Point intersection(Point _p1, Point _p2, Point _p3, Point _p4){
        Point inter = null;

        if(!_p1.x.equals(_p2.x) && !_p3.x.equals(_p4.x)){
            Float a1 = (_p1.y-_p2.y) / (_p1.x-_p2.x);
            Float b1 = _p1.y - a1*_p1.x;
            Float a2 = (_p3.y-_p4.y) / (_p3.x-_p4.x);
            Float b2 = _p3.y - a2*_p3.x;

            if(a1.equals(a2) && b1.equals(b2)) return _p1;
            else if(a1.equals(a2)) return null;

            inter = new Point((b2-b1) / (a1-a2), a1 * (b2-b1) / (a1-a2) + b1);
        }
        else if(_p1.x.equals(_p2.x)){
            Float a = (_p3.y-_p4.y) / (_p3.x-_p4.x);
            Float b = _p3.y - a*_p3.x;

            inter  = new Point(_p1.x, a*_p1.x+b);
        }
        else {
            Float a = (_p1.y-_p2.y) / (_p1.x-_p2.x);
            Float b = _p1.y - a*_p1.x;

            inter  = new Point(_p3.x, a*_p3.x+b);
        }

        boolean in1 = (inter.x >= Math.min(_p1.x, _p2.x) &&
                        inter.x <= Math.max(_p1.x, _p2.x) &&
                        inter.y >= Math.min(_p1.y, _p2.y) &&
                        inter.y <= Math.max(_p1.y, _p2.y));
        boolean in2 = (inter.x >= Math.min(_p3.x, _p4.x) &&
                        inter.x <= Math.max(_p3.x, _p4.x) &&
                        inter.y >= Math.min(_p3.y, _p4.y) &&
                        inter.y <= Math.max(_p3.y, _p4.y));
        if(in1 && in2) return inter;
        return null;
    }

    public static void main(String[] args) {
        Point p1 = new Point((float) 0, (float) 4);
        Point p2 = new Point((float) 8, (float) 4);
        Point p3 = new Point((float) 0, (float) 4);
        Point p4 = new Point((float) 8, (float) 4);

        System.out.println(Test.intersection(p1, p2, p3, p4));
    }
}
