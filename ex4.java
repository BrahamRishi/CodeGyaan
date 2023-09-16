class Rectangle {
        private double width;
        private double length;
        private String color;
        private double area;

        public void setWidth(double width) {
            this.width = width;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void findArea() {
            this.area = width * length;
        }

        public double getArea() {
            return area;
        }

        public String getColor() {
            return color;
        }
    }

    public class ex4 {
        public static void main(String[] args) {
            Rectangle rectangle1 = new Rectangle();
            rectangle1.setWidth(5.0);
            rectangle1.setLength(10.0);
            rectangle1.setColor("Red");
            rectangle1.findArea();

            Rectangle rectangle2 = new Rectangle();
            rectangle2.setWidth(5.0);
            rectangle2.setLength(10.0);
            rectangle2.setColor("Red");
            rectangle2.findArea();

            if (rectangle1.getArea() == rectangle2.getArea() && rectangle1.getColor().equals(rectangle2.getColor())) {
                System.out.println("Matching Rectangles");
            } else {
                System.out.println("Non Matching Rectangles");
            }
        }
    }
