package com.oocode

class Answerer {
    fun answerFor(question: String): String {
        if (question.contains("name")) {
            return "Chris"
        }
        if (question.contains("2")) {
            return "4"
        }
        return "I don't know"
    }
}