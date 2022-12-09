package hello.aop.internalcall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CallServiceV1 {

/*    private CallServiceV1 callServiceV1;
    // 순환 참조를 해결하기 위해 세터로 입력 생성주기와 세터주기는 다름 세터 주기 -> 생성이 끝난 이후
    //??? 에러 바뀌었나봄 실패
    @Autowired
    public void setCallServiceV1(CallServiceV1 callServiceV1) {
        this.callServiceV1 = callServiceV1;
    }*/

    public void external() {
        log.info("call external");
//        callServiceV1.internal();
    }

    public void internal() {
        log.info("call internal");
    }

}
