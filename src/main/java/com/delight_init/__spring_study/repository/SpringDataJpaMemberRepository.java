package com.delight_init.__spring_study.repository;

import com.delight_init.__spring_study.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends
        JpaRepository<Member, Long>, MemberRepository
{
    @Override
    Optional<Member> findByName(String name);
}
