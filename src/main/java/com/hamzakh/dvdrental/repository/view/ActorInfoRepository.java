package com.hamzakh.dvdrental.repository.view;

import com.hamzakh.dvdrental.entity.view.ActorInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorInfoRepository extends JpaRepository<ActorInfo, Integer> {
}