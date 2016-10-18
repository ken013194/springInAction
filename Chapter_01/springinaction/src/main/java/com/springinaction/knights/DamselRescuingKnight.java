package com.springinaction.knights;

import com.springinaction.quests.RescueDamselQuest;

/**
 * The DamselRescuingKnight can only embark on RescuingDamselQuests
 * No use on any Other use
 * 
 * @author ken.lee
 *
 */
public class DamselRescuingKnight implements Knight{

	private RescueDamselQuest quest;
	
	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest();
	}
	
	public void embarkOnQuest() {
		quest.embark();
	}

}
