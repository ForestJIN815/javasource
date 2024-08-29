package api;

// extends Object 기본
public class Value {
    int Value;

    public Value(int value) {
        this.Value = value;
    }

    @Override
    public boolean equals(Object obj) {

        Value other = (Value) obj;
        if (Value != other.Value)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Value [Value=" + Value + "]";
    }

    // ~ toString 해줌으로써.. 주소값이 -> ㅇ 로 바뀐다?
    // ~ 그러므로 [ equals, toString ] 이 둘은 반드시 정의해 준다.
    // ~ 무조건, 무조건 이야!!

}
