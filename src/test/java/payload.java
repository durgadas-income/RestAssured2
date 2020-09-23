public class payload {

    public static String coursePrice(){
        return "{\n"+
                "\n"+
                "\"dashboard\": {\n"+
                "\n"+
                "\"purchaseAmount\": 910,\n"+
                "\n"+
                "\"website\": \"rahulshettyacademy.com\"\n"+
                "\n"+
                "},\n"+
                "\n"+
                "\"courses\": [\n"+
                "\n"+
                "{\n"+
                "\n"+
                "\"title\": \"Selenium Python\",\n"+
                "\n"+
                "\"price\": 50,\n"+
                "\n"+
                "\"copies\": 6\n"+
                "\n"+
                "},\n"+
                "\n"+
                "{\n"+
                "\n"+
                "\"title\": \"Cypress\",\n"+
                "\n"+
                "\"price\": 40,\n"+
                "\n"+
                "\"copies\": 4\n"+
                "\n"+
                "},\n"+
                "\n"+
                "{\n"+
                "\n"+
                "\"title\": \"RPA\",\n"+
                "\n"+
                "\"price\": 45,\n"+
                "\n"+
                "\"copies\": 10\n"+
                "\n"+
                "}\n"+
                "\n"+
                "]\n"+
                "\n"+
                "}";
    }

    public static String postNewPlace(){
        String s="{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -40,\n" +
                "    \"lng\": 20.427362\n" +
                "  },\n" +
                "  \"accuracy\": 45,\n" +
                "  \"name\": \"Frontline house\",\n" +
                "  \"phone_number\": \"(+91) 123 456 7890\",\n" +
                "  \"address\": \"30, Lake Side, 302 Front Tier\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park1\",\n" +
                "    \"shop1\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}";
        return s;
    }

}
