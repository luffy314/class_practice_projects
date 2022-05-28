package j.day34_return_methods;

public class MethodWithOthers {
    public static String dayInWords(int day) {
//
//        String strDay = "";
//
//        switch (day){
//            case 1:
//                strDay = "Monday";
//                break;
//            case 2:
//                strDay = "Tuesday";
//                break;
//            case 3:
//                strDay = "Wednesday";
//                break;
//            case 4:
//                strDay = "Thursday";
//                break;
//            case 5:
//                strDay = "Friday";
//                break;
//            case 6:
//                strDay = "Saturday";
//                break;
//            case 7:
//                strDay = "Sunday";
//                break;
//            default:
//                strDay = "Invalid";
//        }
//        return strDay;
//    }



            switch (day) {
                case 1:
                    return "Monday";
                case 2:
                    return "Tuesday";
                case 3:
                    return "Wednesday";
                case 4:
                    return "Thursday";
                case 5:
                    return "Friday";
                case 6:
                    return "Saturday";
                case 7:
                    return "Sunday";
                default:
                    return "Invalid";
            }

        }

}
