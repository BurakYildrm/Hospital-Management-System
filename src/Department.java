public enum Department {
    DERMATOLOGY(1),
    INTERNAL_MEDICINE(2),
    NEUROLOGY(3),
    OPHTHALMOLOGY(4),
    OTOLARYNGOLOGY(5),
    PATHOLOGY(6),
    PEDIATRICS(7),
    SURGERY(8);

    private int numVal;

    Department(int numVal) {
        this.numVal = numVal;
    }

    static void printDepartments(){
        for (Department d: Department.values()) {
            System.out.println(d.numVal + ")" + d);
        }
    }
}