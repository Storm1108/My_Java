package Homework.Hw2;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.*;
import java.util.logging.FileHandler;
//Студент [фамилия] получил [оценка] по предмету [предмет].
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
public class Hw23 {

    public static void main(String[] args) throws ParseException {
        BufferedReader reader;
        String resultJson = new String();
        try {
            //"[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}]");
            reader = new BufferedReader(new FileReader("Homework/Hw2/start.json"));
            resultJson = reader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JSONArray jsonArr = (JSONArray) JSONValue.parseWithException(resultJson);
        StringBuilder result = new StringBuilder();
        JSONObject temp;
        for (int i = 0; i < jsonArr.toArray().length; i++) {
            temp = (JSONObject) jsonArr.get(i);
            result.append("Студент ");
            result.append(temp.get("фамилия"));
            result.append(" получил ");
            result.append(temp.get("оценка"));
            result.append(" по предмету ");
            result.append(temp.get("предмет"));
            result.append(".\n");
        }
        try (PrintWriter out = new PrintWriter(new FileWriter("Homework/Hw2/res.json"))) {
            out.write(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
