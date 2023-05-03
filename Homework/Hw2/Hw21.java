package Homework.Hw2;
/*Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}*/
public class Hw21 {
    static String[] splitString (StringBuilder strb){
        strb.deleteCharAt(0);
        strb.deleteCharAt(strb.lastIndexOf("}"));
        String[] strArr = (strb.toString().split(","));
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].trim();
            strArr[i] = strArr[i].replace(':', '=');
        }
        System.out.println(strArr[0]);
        return strArr;
    }
    static String result(String[] strArr){
        StringBuilder res = new StringBuilder("select * from students where ");
        for (String elem :
                strArr) {
            if (!elem.contains("null")){
                res.append(elem).append(" and ");
            };
        }
        res.delete(res.length()-4,res.length()-1);

        return res.toString();
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
        System.out.println(result(splitString(str)));
    }
}
