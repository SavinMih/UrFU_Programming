package lr12;
import java.util.List;

public class Task9{
    public static void main(String[] args) {
        String string = "9. Напишите функцию, которая принимает на вход список строк и " +
                "возвращает новый список, содержащий только те строки, которые содержат " +
                "только буквы (без цифр и символов).";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после считывания: \n");
        for(String s : strings){
            System.out.println(s);
        }

        List<String> stringAfter = filterOnlyLetters(strings);

        System.out.println("\nСтрока после фильтрации:\n");
        for(String s : stringAfter){
            System.out.println(s);
        }
    }
    public static List<String> filterOnlyLetters(List<String> strings){
        // фильтр для кириллицы
        return strings.stream().filter(s -> s.matches("[а-яА-Я]+")).toList();
    }
}