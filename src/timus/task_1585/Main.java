package timus.task_1585;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        Map<String, Integer> reps = new HashMap<>();

        for (int i = 0; i < num; i++) {
            String name = in.nextLine();
            int newValue = reps.getOrDefault(name, 0) + 1;
            reps.put(name, newValue);
        }

        int maximum = 0;
        String result = "";

        for (String code : reps.keySet()) {
            if (reps.get(code) > maximum) {
                maximum = reps.get(code);
                result = code;
            }
        }

        System.out.println(result);
    }
}
