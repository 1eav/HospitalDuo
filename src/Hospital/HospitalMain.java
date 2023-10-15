package Hospital;

import java.util.Random;
import java.util.Scanner;

public class HospitalMain {
    public static void main(String[] args) {
        Random random = new Random();
        char choiseCabinets;
        char choisePatientsCab1;
        char choisePatientsCab2;
        char choisePatientsCab3;
        char choisePatientsCab4;
        int countHealtny = 0;
        int countSick = 0;
        float allTemperatures;
        float arithmetic;

        Persons person = new Persons();
        person.patient1 = "Пациент №01";
        person.patient2 = "Пациент №02";
        person.patient3 = "Пациент №03";
        person.patient4 = "Пациент №04";
        person.patient5 = "Пациент №05";
        person.patient6 = "Пациент №06";
        person.patient7 = "Пациент №07";
        person.patient8 = "Пациент №08";
        person.patient9 = "Пациент №09";
        person.patient10 = "Пациент №10";
        person.patient11 = "Пациент №11";

        Temperature temperature = new Temperature();
        Temperature.celsius1 = (random.nextFloat(6)+34);
        Temperature.celsius2 = (random.nextFloat(6)+34);
        Temperature.celsius3 = (random.nextFloat(6)+34);
        Temperature.celsius4 = (random.nextFloat(6)+34);
        Temperature.celsius5 = (random.nextFloat(6)+34);
        Temperature.celsius6 = (random.nextFloat(6)+34);
        Temperature.celsius7 = (random.nextFloat(6)+34);
        Temperature.celsius8 = (random.nextFloat(6)+34);
        Temperature.celsius9 = (random.nextFloat(6)+34);
        Temperature.celsius10 = (random.nextFloat(6)+34);
        Temperature.celsius11 = (random.nextFloat(6)+34);
        allTemperatures = temperature.celsius1 +
                temperature.celsius2 +
                temperature.celsius3 +
                temperature.celsius4 +
                temperature.celsius5 +
                temperature.celsius6 +
                temperature.celsius7 +
                temperature.celsius8 +
                temperature.celsius9 +
                temperature.celsius10 +
                temperature.celsius11;
        arithmetic = allTemperatures / 11;

        Scanner input = new Scanner(System.in);
        System.out.println("<АНАЛИЗ ПАЦИЕНТОВ>");

        System.out.println("Выбор кабинета для пациентов\n----------------------------");
        do {
            System.out.println("1. <Кабинет №1>");
            System.out.println("2. <Кабинет №2>");
            System.out.println("3. <Кабинет №3>");
            System.out.println("4. <Кабинет №4>");
            System.out.println("0. <Завершить>");
            System.out.println("\nВыбор категории: ");
            switch (choiseCabinets = input.next().charAt(0)) {
                case '1':
                    do {
                        System.out.println("(Кабинет №1) Проверить температуру пациента\n-------------------------------------------");
                        System.out.println("1. <Пациент №01>");
                        System.out.println("2. <Пациент №02>");
                        System.out.println("0. <Следующий кабинет (Кабинет №2)>");
                        System.out.println("\nВыбор категории: ");
                        switch (choisePatientsCab1 = input.next().charAt(0)) {
                            case '1':
                                System.out.println(person.patient1 + ">(Кабинет №1)");
                                System.out.println("Температура пациента:");
                                System.out.println(Math.ceil(temperature.celsius1));
                                break;
                            case '2':
                                System.out.println(person.patient2 + ">(Кабинет №1)");
                                System.out.println("Температура пациента:");
                                System.out.println(Math.ceil(temperature.celsius2));
                                break;
                            case '0':
                                break;
                            default:
                                System.out.println("Ошибка! Некорректный ввод");
                                System.out.println(" ");
                        }
                    } while (choisePatientsCab1 != '0');
                case '2':
                    do {
                        System.out.println("(Кабинет №2) Проверить температуру пациента\n-------------------------------------------");
                        System.out.println("1. <Пациент №03>");
                        System.out.println("2. <Пациент №04>");
                        System.out.println("3. <Пациент №05>");
                        System.out.println("4. <Пациент №06>");
                        System.out.println("0. <Следующий кабинет (Кабинет №3)>");
                        System.out.println("\nВыбор категории: ");
                        switch (choisePatientsCab2 = input.next().charAt(0)) {
                            case '1':
                                System.out.println(person.patient3 + ">(Кабинет №2)");
                                System.out.println("Температура пациента:");
                                System.out.println(Math.ceil(temperature.celsius3));
                                break;
                            case '2':
                                System.out.println(person.patient4 + ">(Кабинет №2)");
                                System.out.println("Температура пациента:");
                                System.out.println(Math.ceil(temperature.celsius4));
                                break;
                            case '3':
                                System.out.println(person.patient5 + ">(Кабинет №2)");
                                System.out.println("Температура пациента:");
                                System.out.println(Math.ceil(temperature.celsius5));
                                break;
                            case '4':
                                System.out.println(person.patient6 + ">(Кабинет №2)");
                                System.out.println("Температура пациента:");
                                System.out.println(Math.ceil(temperature.celsius6));
                                break;
                            case '0':
                                break;
                            default:
                                System.out.println("Ошибка! Некорректный ввод");
                                System.out.println(" ");
                        }
                    } while (choisePatientsCab2 != '0');
                case '3':
                    do {
                        System.out.println("(Кабинет №3) Проверить температуру пациента\n-------------------------------------------");
                        System.out.println("1. <Пациент №07>");
                        System.out.println("2. <Пациент №08>");
                        System.out.println("3. <Пациент №09>");
                        System.out.println("0. <Следующий кабинет (Кабинет №4)>");
                        System.out.println("\nВыбор категории: ");
                        switch (choisePatientsCab3 = input.next().charAt(0)) {
                            case '1':
                                System.out.println(person.patient7 + ">(Кабинет №3)");
                                System.out.println("Температура пациента:");
                                System.out.println(Math.ceil(temperature.celsius7));
                                break;
                            case '2':
                                System.out.println(person.patient8 + ">(Кабинет №3)");
                                System.out.println("Температура пациента:");
                                System.out.println(Math.ceil(temperature.celsius8));
                                break;
                            case '3':
                                System.out.println(person.patient9 + ">(Кабинет №3)");
                                System.out.println("Температура пациента:");
                                System.out.println(Math.ceil(temperature.celsius9));
                                break;
                            case '0':
                                break;
                            default:
                                System.out.println("Ошибка! Некорректный ввод");
                                System.out.println(" ");
                        }
                    } while (choisePatientsCab3 != '0');
                case '4':
                    do {
                        System.out.println("(Кабинет №4) Проверить температуру пациента\n-------------------------------------------");
                        System.out.println("1. <Пациент №10>");
                        System.out.println("2. <Пациент №11>");
                        System.out.println("3. <Просмотреть список пациентов и их результаты>");
                        System.out.println("\nВыбор категории: ");
                        switch (choisePatientsCab4 = input.next().charAt(0)) {
                            case '1' -> {
                                System.out.println(person.patient10 + ">(Кабинет №4)");
                                System.out.println("Температура пациента:");
                                System.out.println(Math.ceil(temperature.celsius10));
                            }
                            case '2' -> {
                                System.out.println(person.patient11 + ">(Кабинет №4)");
                                System.out.println("Температура пациента:");
                                System.out.println(Math.ceil(temperature.celsius11));
                            }
                            case '3' -> {
                                System.out.println("Список пациентов и их результаты:\n---------------------------------");
                                System.out.println(person.patient1 + " t" + Math.ceil(temperature.celsius1) + ">(Кабинет №1)");
                                if (temperature.celsius1 <= 36) {
                                    countHealtny++;
                                    System.out.println("Пациент здоров!");
                                } else if (temperature.celsius1 > 36) {
                                    countSick++;
                                    System.out.println("Пациент болен!");
                                }
                                System.out.println(person.patient2 + " t" + Math.ceil(temperature.celsius2) + ">(Кабинет №1)");
                                if (temperature.celsius2 <= 36) {
                                    countHealtny++;
                                    System.out.println("Пациент здоров!");
                                } else if (temperature.celsius2 > 36) {
                                    countSick++;
                                    System.out.println("Пациент болен!");
                                }
                                System.out.println(person.patient3 + " t" + Math.ceil(temperature.celsius3) + ">(Кабинет №2)");
                                if (temperature.celsius3 <= 36) {
                                    countHealtny++;
                                    System.out.println("Пациент здоров!");
                                } else if (temperature.celsius3 > 36) {
                                    countSick++;
                                    System.out.println("Пациент болен!");
                                }
                                System.out.println(person.patient4 + " t" + Math.ceil(temperature.celsius4) + ">(Кабинет №2)");
                                if (temperature.celsius4 <= 36) {
                                    countHealtny++;
                                    System.out.println("Пациент здоров!");
                                } else if (temperature.celsius4 > 36) {
                                    countSick++;
                                    System.out.println("Пациент болен!");
                                }
                                System.out.println(person.patient5 + " t" + Math.ceil(temperature.celsius5) + ">(Кабинет №2)");
                                if (temperature.celsius5 <= 36) {
                                    countHealtny++;
                                    System.out.println("Пациент здоров!");
                                } else if (temperature.celsius5 > 36) {
                                    countSick++;
                                    System.out.println("Пациент болен!");
                                }
                                System.out.println(person.patient6 + " t" + Math.ceil(temperature.celsius6) + ">(Кабинет №2)");
                                if (temperature.celsius6 <= 36) {
                                    countHealtny++;
                                    System.out.println("Пациент здоров!");
                                } else if (temperature.celsius6 > 36) {
                                    countSick++;
                                    System.out.println("Пациент болен!");
                                }
                                System.out.println(person.patient7 + " t" + Math.ceil(temperature.celsius7) + ">(Кабинет №3)");
                                if (temperature.celsius7 <= 36) {
                                    countHealtny++;
                                    System.out.println("Пациент здоров!");
                                } else if (temperature.celsius7 > 36) {
                                    countSick++;
                                    System.out.println("Пациент болен!");
                                }
                                System.out.println(person.patient8 + " t" + Math.ceil(temperature.celsius8) + ">(Кабинет №3)");
                                if (temperature.celsius8 <= 36) {
                                    countHealtny++;
                                    System.out.println("Пациент здоров!");
                                } else if (temperature.celsius8 > 36) {
                                    countSick++;
                                    System.out.println("Пациент болен!");
                                }
                                System.out.println(person.patient9 + " t" + Math.ceil(temperature.celsius9) + ">(Кабинет №3)");
                                if (temperature.celsius9 <= 36) {
                                    countHealtny++;
                                    System.out.println("Пациент здоров!");
                                } else if (temperature.celsius9 > 36) {
                                    countSick++;
                                    System.out.println("Пациент болен!");
                                }
                                System.out.println(person.patient10 + " t" + Math.ceil(temperature.celsius10) + ">(Кабинет №4)");
                                if (temperature.celsius10 <= 36) {
                                    countHealtny++;
                                    System.out.println("Пациент здоров!");
                                } else if (temperature.celsius10 > 36) {
                                    countSick++;
                                    System.out.println("Пациент болен!");
                                }
                                System.out.println(person.patient11 + " t" + Math.ceil(temperature.celsius1) + ">(Кабинет №4)");
                                if (temperature.celsius11 <= 36) {
                                    countHealtny++;
                                    System.out.println("Пациент здоров!");
                                } else if (temperature.celsius11 > 36) {
                                    countSick++;
                                    System.out.println("Пациент болен!");
                                }
                                System.out.println("Количество здоровых пациентов: " + countHealtny);
                                System.out.println("Количество больных пациентов: " + countSick);
                                System.out.println("Среднее арифметическое значение температуы " + Math.ceil(arithmetic));
                                System.out.println("-------------------------------------------");
                                System.out.println("Выбор кабинета для пациентов\n-------------------------------------------");
                            }
                            default -> {
                                System.out.println("Ошибка! Некорректный ввод");
                                System.out.println(" ");
                            }
                        }
                    } while (choisePatientsCab4 != '0');
                case '0':
                    break;
                default:
                    System.out.println("Ошибка! Некорректный ввод");
                    System.out.println(" ");
            }

        } while (choiseCabinets != '0');

    }
}