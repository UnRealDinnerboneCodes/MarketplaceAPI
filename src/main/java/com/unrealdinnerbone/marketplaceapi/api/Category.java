package com.unrealdinnerbone.marketplaceapi.api;


public enum Category
{
    SURVIVAL_SPAWN("survival_spawn_world"),
    MINI_GAME("mini_game_world"),
    ADVENTURE("adventure_world"),
    //MASHUP("mashup"),
    SKIN_PACK("skinpack"),
    RESOURCE_PACK("resourcepack");
    ;

    private final String name;
    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
