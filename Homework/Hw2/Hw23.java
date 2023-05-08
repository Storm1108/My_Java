package Homework.Hw2;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.*;
import java.util.logging.FileHandler;

//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
public class Hw23 {

    public static void main(String[] args) throws ParseException {
        BufferedReader reader;
        String resultJson = new String();
        try {
            //"[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}]");
            reader = new BufferedReader(new FileReader("Homework/Hw2/string.json"));
            resultJson =reader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JSONArray jsonArr = (JSONArray) JSONValue.parseWithException(resultJson);
        StringBuilder result = new StringBuilder();
        JSONObject temp = new JSONObject();
            for (int i = 0; i < jsonArr.toArray().length; i++) {
                result.append("Студент ");
                result.append()
            }
        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            out.write(result);
        } catch (Exception e) {
            e.printStackTrace();
    }
}
