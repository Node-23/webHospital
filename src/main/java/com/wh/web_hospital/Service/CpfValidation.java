package com.wh.web_hospital.Service;

public class CpfValidation {

    public static boolean cpfVerification(String cpf) {

        if (cpfSameNumbers(cpf) == true) {
            return false;
        }

        if (verificationOne(cpf) == false || verificationTwo(cpf) == false) {
            return false;
        }
        return true;
    }

    private static boolean cpfSameNumbers(String cpf) {

        int[] digits = cpf.chars().map(c -> c - '0').toArray();
        for (int i = 1; i < 11; i++) {
            if (digits[0] != digits[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean verificationOne(String cpf) {
        int sum = 0;
        int[] digits = cpf.chars().map(c -> c - '0').toArray();

        for (int i = 1; i < 10; i++) {
            sum += digits[i - 1] * (11 - i);
        }

        sum *= 10;

        if (sum % 11 != digits[9]) {
            return false;
        }

        return true;
    }

    private static boolean verificationTwo(String cpf) {
        int sum = 0;
        int[] digits = cpf.chars().map(c -> c - '0').toArray();

        for (int i = 1; i < 11; i++) {
            sum += digits[i - 1] * (12 - i);
        }

        sum *= 10;

        if (sum % 11 != digits[10]) {
            return false;
        }

        return true;
    }

}
