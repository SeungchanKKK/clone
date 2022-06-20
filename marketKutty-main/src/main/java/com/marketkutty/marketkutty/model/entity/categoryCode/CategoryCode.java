package com.marketkutty.marketkutty.model.entity.categoryCode;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class CategoryCode {
//대신 비즈니스 엔티티가 코드 값 자체를 가지고 있는게 더 좋습니다.
// 공통 코드의 값을 조회할 때는, 공통 코드 자체를 캐시에 올려두고
// 애플리케이션에서 필요한 CommonCodeService 같은 것을 호출해서 불러서
// 그 값을 찾는 방식으로 진행하는 것이 더 나은 선택입니다.
// 하지만 JPA를 사용한다면 DB에서 애플리케이션으로 관점을 확실하게 옮기는 것이 필요합니다.
// 정말 코드 컴파일 없이 동적으로 공통 코드가 변경되어야 하면 공통 코드 테이블을 사용할 수 있지만,
// 그게 아니라면 가급적 ENUM을 사용하는 것을 권장드립니다.- by. 갓영한 선생님
// enum을 쓰라고도 했으나, 001001과 같이 이루어진 코드인데 붙일 네이밍도 없고..양도 많고..어떻게 해야할지 모르겠다
// 하여 캐시 방법으로 하고, 연관관계를 맺지 않는다.

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int code; //001001 | 001
    private int depth1; //001
    private int depth2; //001
    private String name; //유기농 | 채소
}
