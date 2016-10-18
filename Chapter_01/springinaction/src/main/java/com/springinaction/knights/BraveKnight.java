package com.springinaction.knights;

import com.springinaction.quests.Quest;

public class BraveKnight implements Knight{
	
	private Quest quest;
	
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
	
	public void embarkOnQuest(){
		quest.embark();
	}
}
