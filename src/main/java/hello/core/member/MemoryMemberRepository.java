package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    //동시성 이슈 발생 가능성 있음

    @Override
    public void save(Member member) {
        store.put(member.getId(),member);
    }

    
    @Override
    public Member findById(Long memberId) {

        System.out.println("store = " + store);
        return store.get(memberId);
    }

    
}
