fun main() {
    val quizAnswer1 = 15
    var quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47

    // Write your code below
    println("What is 75 / 5?");
    var studentAnswer1 = Integer.valueOf(readLine());

    println("What is the value of y when 6 * 2y = 36?");
    var studentAnswer2 = Integer.valueOf(readLine());

    println("Name a triangle with two equal sides: ");
    var studentAnswer3 = readLine();

    println("Evaluate 8 * 6 - (3 - 2)");
    var studentAnswer4 = Integer.valueOf(readLine());

    // variable that holds points for correct answers
    var points = 0;

    // grade questions
    // question 1
    if (studentAnswer1 == quizAnswer1) {
        points += 25;
    }

    // question 2
    if (studentAnswer2 == quizAnswer2) {
        points += 25;
    } else if (studentAnswer2 == quizAnswer2++ || studentAnswer2 == quizAnswer2--) {
        points += 20;
        println("The answer $studentAnswer2 is within 1 point of $quizAnswer2.");
    } else {
        points++;
    }

    // question 3
    if (studentAnswer3 == quizAnswer3) {
        points += 25;
    } else if (studentAnswer3 == "equilateral") {
        points += 10;
    } else {
        points++;
    }

    // question 4
    if (studentAnswer4 == quizAnswer4) {
        points += 25;
    } else if (studentAnswer4 in 44..54) {
        points += 20;
    } else {
        points++;
    }


    // now return the final grade
    when (points) {
        in 0..59 -> println("Final Grade: F");
        in 60..69 -> println("Final Grade: D");
        in 70..79 -> println("Final Grade: C");
        in 80..89 -> println("Final Grade: B");
        in 90..100 -> println("Final Grade: A");
        in 101..110 -> println("Final Grade: A+");
    }
}