package tcgwars.logic.effect;

/**
 * @author axpendix@hotmail.com
 */
public enum EffectType {

  MOVE_CARD,
  EFFECT_LIST,
  COIN_FLIP,
  COIN_FLIP_BETWEEN_EXECUTION,
  DAMAGE,
  DIRECT_DAMAGE,
  SWIFT_DAMAGE,
  MOVE,
  PLAY_CARD,
  PUT_ON_BENCH,
  PLAY_BASIC_POKEMON,
  PLAY_EVOLUTION,
  PLAY_LEVEL_UP,
  PLAY_SPECIAL_ENERGY,
  PLAY_ENERGY,
  CHECK_ATTACH_ENERGY_REQUIREMENT,
  ATTACH_ENERGY,
  ENERGY_SWITCH,
  ENERGY_SWITCH_WITH_SELECTION,
  PLAY_TRAINER,
  CHECK_TRAINER_REQUIREMENTS,
  PLAY_SUPPORTER,
  PLAY_STADIUM,
  ACTIVATE_STADIUM,
  PLAY_POKEMON_TOOL,
  PLAY_POKEMON_TOOL_FLARE,
  ATTACH_POKEMON_TOOL,
  PLAY_TECHNICAL_MACHINE,
  USE_ABILITY,
  USE_STADIUM_TRAINER,
  EVOLVE,
  EVOLVE_STANDARD,
  DEVOLVE,
  LEVEL_UP,
  LEVEL_UP_STANDARD,
  RESISTANCE,
  WEAKNESS,
  RETREAT,
  TRY_RETREAT,
  SWITCH, /* RUNS GET_BENCHED THEN SWITCH_OUT */
  SWITCH_OUT, /* CHANGE OF ACTIVE POKEMON */
  FALL_BACK, /* BENCHING IT FROM ACTIVE */
  KNOCKOUT,
  CHECK_FAINT,
  TAKE_PRIZE,
  TRAINER_EFFECT,
  SUPPORTER_EFFECT,
  STADIUM_EFFECT,
  BETWEEN_TURNS,
  BEGIN_TURN,
  DRAW_CARD,
  DISCARD,
  DISCARD_ENERGY,
  DISCARD_SELF_ENERGY,
  CHECK_ENERGY_SUFFICIENCY,
  ENERGY_COST_CALCULATOR,
  REMOVE_FROM_PLAY,
  SHUFFLE_DECK,
  SHUFFLE_TO_DECK,
  REMOVE_DAMAGE_COUNTER,
  MEGA_EVOLUTION_RULE,

  ASLEEP_SPC,
  BURNED_SPC,
  CONFUSED_SPC,
  PARALYZED_SPC,
  POISONED_SPC,
  APPLY_SPECIAL_CONDITION,
  CLEAR_SPECIAL_CONDITION,

  PREVENT_EVOLVE,
  PREVENT_EFFECT,
  PREVENT_PLAY_ENERGY,
  PREVENT_PLAY_SUPPORTER,
  PREVENT_PLAY_STADIUM,

  NEVER_ENDING_COIN_FLIP,
  CUSTOM_EFFECT,
  CUSTOM_ATTACK_EFFECT,
  BLOCKING_EFFECT,

  /*
   * attack effects
   */
  ATTACK_MAIN,
  CHECK_ATTACK_REQUIREMENTS,
  PROCESS_ATTACK_EFFECTS,
  APPLY_WEAKNESS,
  APPLY_RESISTANCE,
  APPLY_ATTACK_DAMAGES,
  APPLY_DAMAGES,

  /*
   * getter effects
   */

  GET_ENERGY_TYPES,
  SELECT_ENERGY,
  COIN_FLIP_GETTER,
  EXTRA_ENERGY_CALCULATOR,
  GET_ENERGY_SUFFICIENT,
  GET_RETREAT_COST,
  GET_POKEMON_TYPE,
  GET_CARD_TYPES,
  IS_AVAILABLE_FOR_TECHNICAL_MACHINE,
  GET_MOVE_LIST,
  GET_WEAKNESSES,
  GET_RESISTANCES,
  GET_FULL_HP,
  GET_GIVEN_PRIZES,
  IS_ABILITY_BLOCKED,
  IS_GLOBAL_ABILITY_BLOCKED,
  GET_ABILITIES,
  GET_BENCH_SIZE,
  GET_EXTRA_POISON,
  GET_BURN_DAMAGE,
  GET_MAX_SUPPORTER_PER_TURN,

  /*
   * abilities
   */
  POKEBODY,
  POKEPOWER,
  POKEMONPOWER,
  CUSTOM_ABILITY,
  BW_ABILITY, //BW-on
  ANCIENT_TRAIT,
  ACTIVATE_ABILITIES,
  DEACTIVATE_ABILITIES,
  ACTIVATE_ABILITY,
  DEACTIVATE_ABILITY,
  BLOCK_ABILITY,
  CHECK_ABILITIES,
  ;

  @Override
  public String toString() {
    return name();
  }
}
