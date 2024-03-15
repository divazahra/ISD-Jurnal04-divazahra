import java.util.Comparator;

public class Data {

    private String mataKuliah;
    private String namaTugas;
    private String deadline;

    public Data (String mataKuliah, String namaTugas, String deadline) {
        this.mataKuliah = mataKuliah;
        this.namaTugas = namaTugas;
        this.deadline = deadline;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Mata Kuliah = " + mataKuliah + ", tugas = " + namaTugas + ", deadline = " + deadline;
    }

    public static Comparator<Data> deadlineComparator = new Comparator<Data>() {
        @Override
        public int compare (Data tugas1, Data tugas2) {
            return tugas1.getDeadline().compareTo(tugas2.getDeadline());
        }
    };
}