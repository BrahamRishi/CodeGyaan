    interface Student {
        void displayGrade();
        void attendance();
    }

    class PG_Student implements Student {
        private String name;
        private double grade;
        private int attendancePercentage;
        public PG_Student(String name, double grade, int attendancePercentage) {
            this.name = name;
            this.grade = grade;
            this.attendancePercentage = attendancePercentage;
        }
        @Override
        public void displayGrade() {
            System.out.println("Post Graduate student " + name + " has a grade of " + grade);
        }
        @Override
        public void attendance() {
            System.out.println("Post Graduate student " + name + " has an attendance percentage of " + attendancePercentage + "%");
        }
    }
    class UG_Student implements Student {
        private String name;
        private double grade;
        private int attendancePercentage;
        public UG_Student(String name, double grade, int attendancePercentage) {
            this.name = name;
            this.grade = grade;
            this.attendancePercentage = attendancePercentage;
        }

        @Override
        public void displayGrade() {
            System.out.println("Under Graduate student " + name + " has a grade of " + grade);
        }

        @Override
        public void attendance() {
            System.out.println("Under Graduate student " + name + " has an attendance percentage of " + attendancePercentage + "%");
        }
    }

    class ex5{
        public static void main(String[] args) {
            PG_Student pgStudent = new PG_Student("Harsh",4.5,90);
                    UG_Student ugStudent = new UG_Student("Rahul", 3.5, 85);

            pgStudent.displayGrade();
            pgStudent.attendance();
            ugStudent.displayGrade();
            ugStudent.attendance();
        }
    }
