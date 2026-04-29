class StudentCard {
    private String studentId;
    private String fullName;

    public StudentCard(String studentId, String fullName) {
        if (studentId == null || studentId.trim().equals("")) {
            throw new IllegalArgumentException("Invalid ID");
        }

        this.studentId = studentId;
        this.fullName = fullName;
    }

    public String toString() {
        return "ID: " + studentId + ", Name: " + fullName;
    }

    public boolean equals(Object o) {
        StudentCard other = (StudentCard) o;
        return this.studentId.equals(other.studentId);
    }

    public boolean studentIdStartsWith(String prefix) {
        if (prefix == null) {
            return false;
        }

        return studentId.startsWith(prefix);
    }

    public static StudentCard findByStudentId(StudentCard[] roster, String id) {
        if (roster == null) {
            return null;
        }

        for (int i = 0; i < roster.length; i++) {
            if (roster[i].studentId.equals(id)) {
                return roster[i];
            }
        }

        return null;
    }
}

class Main {
    public static void main(String[] args) {

        StudentCard s1 = new StudentCard("S001", "Ali");
        StudentCard s2 = new StudentCard("S001", "Ahmed");

        System.out.println(s1.equals(s2));

        Object obj = new StudentCard("S002", "Sara");
        System.out.println(obj);

        StudentCard[] cards = {
            new StudentCard("S010", "Usman"),
            new StudentCard("S011", "Hina"),
            new StudentCard("S012", "Bilal")
        };

        System.out.println(StudentCard.findByStudentId(cards, "S010"));
        System.out.println(cards[0].studentIdStartsWith("S0"));
    }
}