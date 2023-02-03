package single.responsibility.principle;

public class FileReader {
    public void readFile(String filePath){
        System.out.println(filePath + " dosyası okundu.");
        // Analiz gerçekleştir
    }
    public void analyze(){
        System.out.println("Dosya analiz edildi..");
    }

    public void write(){
        System.out.println("Dosyaya yazıldı..");
    }
}
