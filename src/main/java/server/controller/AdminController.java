package server.controller;

import com.google.gson.Gson;
import server.dbmanager.DbManager;
import server.models.Question;
import server.models.Quiz;

public class AdminController {

    private DbManager dbManager;

    public AdminController() {
        dbManager = new DbManager();

    }
        //Method for creating a question
    public Boolean createQuiz(Quiz quiz) {
        Boolean ifCreated = dbManager.createQuiz(quiz);

        if(ifCreated) {
            return true;
        } else {
            return false;
        }

    }
        //Method for creating a question
    public Boolean createQuestion(Question question) {

        Boolean ifCreated = dbManager.createQuestion(question);

        if(ifCreated) {
            return true;
        } else {
            return false;
        }

    }
        //Method for deleting a quiz and all it's sub-tables
    public Boolean deleteQuiz(int idQuiz) {

        Boolean ifDeleted = dbManager.deleteQuiz(idQuiz);

        if (ifDeleted) {
            return true;
        } else {
            return false;
        }
    }
}
