class ProgramPenggajian {
    public String nama, jabatan, jenis ;
    public int gajiPokok, ptkp, biayaJabatan;
    int pkp, pkpTerutang, pkpPerBulan;

    ProgramPenggajian() {
        System.out.println("PROGRAM PENGGAJIAN PAJAK PPH");
        System.out.println("-------------------------------------");
    }

    ProgramPenggajian(String nama, String jabatan, String jenis) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.jenis = jenis;

    }
    void dataDiri() {
        System.out.println("nama:"+ this.nama);
        System.out.println("jabatan:"+this.jabatan);
        System.out.println("jenis:"+this.jenis);

    }
    ProgramPenggajian(int gajiPokok, int ptkp, int biayaJabatan) {
        this.gajiPokok = gajiPokok;
        this.ptkp = ptkp;
        this.biayaJabatan = biayaJabatan;
    }
    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    public int getPtkp() {
        return ptkp;
    }

    public void setPtkp(int ptkp) {
        this.ptkp = ptkp;
    }
    public int getBiayaJabatan() {
        return ptkp;
    }

    public void setBiayaJabatan(int biayaJabatan) {
        this.biayaJabatan = biayaJabatan;
    }

    //biaya jabatan
    public int jabatan() {
        return (gajiPokok - biayaJabatan);
    }

    //gaji nettsebulan
    public int gajiNettSebulan() {
        return (jabatan());
    }


    //gaji setahun
    public int gajiNettSetahun() {
        return (gajiNettSebulan()*12);
    }
    //PKP Setahun
    public int pkpSetahun() {
        return (gajiNettSetahun()-ptkp);
    }

    //Pph 21 Terhutang
    public int pphTerutang(){
        return (gajiNettSetahun()*5/100);
    }

    //Pph 21 per bulan
    public int pphPerBulan(){
        return (pphTerutang()/12);

    }
    //gaji bersih
    public int gajiBersih() {
        return (gajiPokok - pphPerBulan());
    }
    public static void main(String[] args) {

        ProgramPenggajian heading = new ProgramPenggajian();

        ProgramPenggajian karyawan = new ProgramPenggajian("Dimas Akbar","Quality Control Product","Tetap");
        karyawan.dataDiri();

        System.out.println("-------------------------------------");
        ProgramPenggajian gaji = new ProgramPenggajian(6000000, 5400000, 300000);
        System.out.println("Gaji pokok: " + gaji.gajiPokok);
        System.out.println("Biaya Jabatan: " + gaji.biayaJabatan);
        System.out.println("Gaji nett sebulan: "+ gaji.jabatan());
        System.out.println("Gaji nett setahun: " + gaji.gajiNettSetahun());
        System.out.println("Pph 21 terhutang: "+gaji.pphTerutang());
        System.out.println("Pph 21 per bulan: "+gaji.pphPerBulan());
        System.out.println("-------------------------------------");
        System.out.println("Gaji yang diterima karyawan "+ karyawan.nama +": "+gaji.gajiBersih());

    }
}


