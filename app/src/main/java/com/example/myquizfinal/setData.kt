package com.example.myquizfinal

object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        val que:ArrayList<QuestionData> = arrayListOf()

        val question1 = QuestionData(
            1,
            "In which city can you find the Colosseum ?",

            "Rome",
            "Paris",
            "Athens",
            "Milano",
            1
        )
        val question2 = QuestionData(
            2,
            "Which fruit is associated with Isaac Newton  ?",

            "Pear",
            "Banana",
            "Apple",
            "Pineapple",
            3
        )
        val question3 = QuestionData(
            3,
            "What was Meta Platforms Inc formerly known as ?",

            "Instagram",
            "Tweeter",
            "Facebook",
            "None of the above",
            3
        )
        val question4 = QuestionData(
            4,
            "Who was the first President of USA ?",

            "Thomas Jefferson",
            "Martin Van Buren",
            "George Washington",
            "James Monroe",
            3
        )

        val question5 = QuestionData(
            5,
            "Which element is said to keep bones strong ?",

            "Carbon",
            "Magnesium",
            "Iron",
            "Calcium",
            4
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que
    }
}