public class DataDosen25 { 
    Dosen25[] dataDosen; 
    int idx; 
 
    public DataDosen25(int kapasitas) { 
        dataDosen = new Dosen25[kapasitas]; 
        idx = 0; 
    } 
 
    public void tambah(Dosen25 dsn) { 
        if (idx < dataDosen.length) { 
            dataDosen[idx] = dsn; 
            idx++; 
        } else { 
            System.out.println("Data dosen penuh!"); 
        } 
    } 
 
    public void tampil() { 
        for (int i = 0; i < idx; i++) { 
            dataDosen[i].tampil(); 
        } 
    } 
 
    public void sortingASC() { 
        for (int i = 0; i < idx - 1; i++) { 
            for (int j = 0; j < idx - 1 - i; j++) { 
                if (dataDosen[j].usia > dataDosen[j + 1].usia) { 
                    Dosen25 temp = dataDosen[j]; 
                    dataDosen[j] = dataDosen[j + 1]; 
                    dataDosen[j + 1] = temp; 
                } 
            } 
        } 
    } 
 
    public void sortingDSC() { 
        for (int i = 1; i < idx; i++) { 
            Dosen25 temp = dataDosen[i]; 
            int j = i; 
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) { 
                dataDosen[j] = dataDosen[j - 1]; 
                j--; 
            } 
            dataDosen[j] = temp; 
        } 
    } 
}
