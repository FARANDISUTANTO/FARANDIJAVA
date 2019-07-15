package testmanusiacsv;


import java.nio.file.Path;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;



public class CSV_manusia implements CSV<Manusia>{
    
    
    @Override
    public void write(Path path, List<Manusia> items){
        try (FileWriter writer = new FileWriter(path.toString());){
            StringBuilder stringbuilder = new StringBuilder();
            for(Manusia manusia : items){
                stringbuilder.append(manusia.getNama());
                stringbuilder.append(",");
                stringbuilder.append(manusia.getUmur());
                stringbuilder.append(",");
                stringbuilder.append(manusia.getBerat());
                stringbuilder.append(",");
                stringbuilder.append(manusia.getJenisKelamin());
                stringbuilder.append("\n");
            }
      
            writer.write(stringbuilder.toString());
            
        } catch (IOException e) {
            System.err.println("I/O exception occured when reading file");
        }
        
    }
    

    @Override
    public List<Manusia> read(Path path) {
        
        List<Manusia> hasil = new ArrayList<Manusia>();
        
        try(BufferedReader reader = new BufferedReader(new FileReader(path.toString()))){
            String line;
            while((line = reader.readLine()) != null){
                String[] manusia = line.split(",");
                hasil.add(new Manusia(manusia[0],
                        Integer.parseInt(manusia[1]),
                        Double.parseDouble(manusia[2]),
                        Boolean.parseBoolean(manusia[3])));
            }
        } catch (IOException e) {
            System.err.println("I/O exception occured when reading file");
        }
        
        return hasil;
              
    }
}
