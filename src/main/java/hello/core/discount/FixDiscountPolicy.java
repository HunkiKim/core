package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        System.out.println("member = " + member);
        if (member.getGrade() == Grade.VIP){  // VIP 는 천원
            return discountFixAmount;
        }
        return 0;
    }
}
