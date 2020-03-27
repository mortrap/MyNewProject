package core;

public class Virus extends Organism {
    private String name;
    private String aggression;
    private String spreadingMethod;
    private String mark;

    public Virus(boolean isLife, boolean isTouch, String name, String aggression, String spreadingMethod, String mark) {
        super(isLife, isTouch);
        this.name = name;
        this.aggression = aggression;
        this.spreadingMethod = spreadingMethod;
        this.mark = mark;
    }

    public void mark(String mark) {
        this.mark = mark;
    }

    public void setSpreadingMethod(String spreadingMethod) {
        this.spreadingMethod = spreadingMethod;
    }

    public void setAggression(String aggression) {
        this.aggression = aggression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String mark() {
        return mark;
    }

    public String getSpreadingMethod() {
        return spreadingMethod;
    }

    public String getAggression() {
        return aggression;
    }

    public String getName() {
        return name;
    }

    public void infection() {
        System.out.println("Infection is successfully");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Virus virus = (Virus) o;

        if (name != null ? !name.equals(virus.name) : virus.name != null) return false;
        if (aggression != null ? !aggression.equals(virus.aggression) : virus.aggression != null) return false;
        if (spreadingMethod != null ? !spreadingMethod.equals(virus.spreadingMethod) : virus.spreadingMethod != null)
            return false;
        return mark != null ? mark.equals(virus.mark) : virus.mark == null;
    }
    @Override
    public int hashCode() {
        return myHashCode();
    }

    public int myHashCode() {

        String qwerty = "qwertasdfgzxcvbyuiophjklnm";
        char[] qweArray = new char[qwerty.length()];
        for (int i = 0; i < qweArray.length; i++) {
            qweArray[i] = qwerty.charAt(i);
        }
        char[] nameArray = new char[name.length()];// name
        for (int i = 0; i < nameArray.length; i++) {
            nameArray[i] = name.charAt(i);
        }

        int count = 2;
        if (nameArray.length>count){
            count = nameArray.length-2;
        }
        char temp = nameArray[count];
        int nameIndex = 0;
        for (int i = 0; i < qweArray.length; i++) {
            if (qweArray[i] == nameArray[count]) {
                nameIndex = i;
            }
        }
        char[] aggrArray = new char[aggression.length()];// aggression
        for (int i = 0; i < aggrArray.length; i++) {
            aggrArray[i] = aggression.charAt(i);
        }
        int aggrIndex = 0;
            count = aggrArray.length-2;
        for (int i = 0; i < qweArray.length; i++) {
            if (qweArray[i] == aggrArray[count]) {
                aggrIndex = i;
            }
        }
        char[] spreadArray = new char[spreadingMethod.length()];//spreadingMethod
        for (int i = 0; i < spreadArray.length; i++) {
            spreadArray[i] = spreadingMethod.charAt(i);
        }
        int spreadIndex = 0;
        count = spreadArray.length-2;
        for (int i = 0; i < qweArray.length; i++) {
            if (qweArray[i] == spreadArray[count]) {
                spreadIndex = i;
            }
        }
        char[] markArray = new char[mark.length()];//spreadingMethod
        for (int i = 0; i < markArray.length; i++) {
            markArray[i] = mark.charAt(i);
        }
        int markIndex = 0;
        count = markArray.length-2;
        for (int i = 0; i < qweArray.length; i++) {
            if (qweArray[i] == markArray[count]) {
                markIndex = i;
            }
        }

        int result = 3*nameIndex + 5*aggrIndex + 7*spreadIndex +13*markIndex;

        return result;
    }
}
