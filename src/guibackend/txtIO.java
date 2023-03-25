package guibackend;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Brian
 */
public class txtIO {
//READ txt
    public static List<String> readPeopleFile()  {
        try {
            return Files.lines(Paths.get("People.txt"))
                        .map(mapTo)//line->new People(line))
                    .collect(Collectors.toList());
        } catch (IOException ex) {
            System.out.println("Error reading txt");
        }
        return null;
    }

    private static Function<String, String> mapTo = (line) -> {
        String[] data = line.split(",");

        return "a";
//        Appointment(Integer.parseInt(data[0]),
//                    data[1], 
//                    Integer.parseInt(data[2]), 
//                    Integer.parseInt(data[3]));
    };
    
    
    
//WRITE/ADD DATA to txt
//    public void addPeopleToFile(People peep) {
//        List<People> peopleLines = IOreader.readPeopleFile();
//        peopleLines.add(peep);
//        try (FileWriter writer = new FileWriter("People.txt")) {
//            for (People person : peopleLines) {
//                writer.write(person.return_string() + System.lineSeparator());
//            }
//        } catch (IOException ex) {
//            java.util.logging.Logger.getLogger(BCD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//    }

    
    
//UPDATE txt SHOULDNT NEED
//    public static void modify_app(Appointment new_app){ 
//        List<Appointment> appList = IOreader.readAppointmentFile().stream()
//                .map(appointment -> appointment.getAppID()== new_app.getAppID() ? new_app : appointment)
//                .collect(Collectors.toList());
//        IOmodify.updateAppointmentListToFile(appList);
//        JOptionPane.showMessageDialog(null, "Appointment Data Updated");
//    }
//    public static void updateAppointmentListToFile(List<String> appList){
//        try (PrintWriter writer = new PrintWriter("Appointment.txt")) {
//            appList.stream().forEach(app -> {
//                String appData = app.return_string();
//                writer.println(appData);
//            });
//            System.out.println("List updated to txt file.");
//        } catch (Exception e) {
//            System.out.println("Error writing list to txt file: " + e.getMessage());
//        }
//    }

    
    
//Search txt SHOULDNT NEED
//    public static String search_Apeep_byID(int id) {
//        Optional<String> result = IOreader.readPeopleFile()
//                .stream()
//                .filter(p -> p.getPeepID() == id)
//                .findFirst();
//        if (result.isPresent()) {
//            return result.get();
//        } else {
//            return null;
//        }
//    }
//    
//    public static List<People> search_peeps_byID(int id) {
//        try {
//            return IOreader.readPeopleFile()
//                    .stream()
//                    .filter(person -> person.getPeepID()==id)
//                    .collect(Collectors.toList());
//        } catch (Exception ioe) {
//            System.out.println("File not found");
//            return null;
//        }
//    }
}
