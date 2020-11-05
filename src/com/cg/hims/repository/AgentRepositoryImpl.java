package com.cg.hims.repository;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;

import com.cg.hims.entities.Agent;
import com.cg.hims.exceptions.AgentNotFoundException;

public class AgentRepositoryImpl implements IAgentRepository {

	private EntityManager entityManager;
	
	public AgentRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public Agent addAgent(Agent agent){
		entityManager.getTransaction().begin();
		entityManager.persist(agent);//Inserts record into DB.
		entityManager.getTransaction().commit();
				
		return agent;
	}

	@Override
	public Agent updateAgent(Agent agent) throws AgentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Agent removeAgent(int agentId) throws AgentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Agent findAgentById(int agentId) throws AgentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Agent> viewAllAgents() {
		// TODO Auto-generated method stub
		return null;
	}

}
