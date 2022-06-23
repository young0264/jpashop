package jpabook.jpashop.service;


import jpabook.jpashop.domain.item.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemUpdateTest {

    @Autowired
    EntityManager em;


    @Test
    public void updateTest() throws Exception {
        Book book = em.find(Book.class, 1);

        //트랜잭션안
        book.setName("asdfasdf");

        //더티체킹 변경감지 == dirty checking
        //트랜잭션 커밋

    }

}
