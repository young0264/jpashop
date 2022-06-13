package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Getter@Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private Address address;

    //ordinal은 숫자로 들어가고 -> 중간에 다른상태가 추가되면 망해. -> String으로써라
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status; //READY, COMP



}
