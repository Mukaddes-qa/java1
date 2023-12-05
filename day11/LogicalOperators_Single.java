package day11;

public class LogicalOperators_Single {
    public static void main(String[] args) {
        // &7 2 ampersand  & 1 ampersand --->> Logical AND Operator
        // This is used to check both conditions are true at the same time

        // && is called short circuit And
        // -->> it does not check the next condition for rocket lunching

        // isEngineRunning && isCommunicationSystemWorking && isAirEnough
        // if isEngineRunning is false then it does not go and check next conditions

        // & ---->> CHECK EACH AND every condition no matter what
        // isEngineRunning && isCommunicationSystemWorking && isAirEnough
        // if isEngineRunning is false
        // it still check isCommucationSystemSystemWorking
        // it still check isAirEnough
        // and eventually give you the outcome

       // System.out.println(7>5 && 1>7);
        // System.out.println(5>5 && 1>7);
        // System.out.println(1>5 && 9>7);

        // System.out.println(7>5 & 1>7);
        // System.out.println(5>5 & 1>7);
        // System.out.println(1>5 & 9>7);

       // System.out.println(9/0);// ERROR!! CAN NOT DIVIDE BY 0
        // I want to check whether dividing 9 by 0 is 3
        // System.out.println(9/0==3);

        // System.out.println(5>10 && 9/0==3);
       // System.out.println(5>10 & 9/0==3); give you error

        System.out.println(10>5 || 9/0==3);
        System.out.println(10>5 | 9/0==3);
    }
}
