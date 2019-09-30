package com.pattern;

/**
 * @author egan
 * @date 2019/9/30 10:27
 * @desc Finery
 */
public class Decorator extends Component {

    private Component person;

    public Decorator(){}

    public Decorator(Component person) {
        this.person = person;
    }

    @Override
    public void show() {
        if(person != null)
            person.show();
    }


}
