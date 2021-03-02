package level11.questJavaRush;

public class Solution {
    public static void main(String[] args) {
        JavarushQuest[] quests = JavarushQuest.values();
        for (JavarushQuest quest :quests) {
            System.out.println(quest.ordinal());
        }
    }
}
