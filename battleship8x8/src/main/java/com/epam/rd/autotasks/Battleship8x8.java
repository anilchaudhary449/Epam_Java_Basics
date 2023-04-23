package com.epam.rd.autotasks;


public class Battleship8x8 {
    private final long ships;
    private long shots = 0L;

    public Battleship8x8(final long ships) {
        this.ships = ships;
    }

    public boolean shoot(String shot) {
        Integer digit0 = Integer.valueOf(String.valueOf(shot.charAt(1)), 10)-1;
        Integer digit1 = Integer.valueOf(String.valueOf(shot.charAt(0)), 18)-10;
        Integer digitOfShots = Integer.decode(0+digit0.toString()+ digit1);
        if(shot.equals("A1")) shots = shots + (0b10000000_00000000_00000000_00000000_00000000_00000000_00000000_00000000L);
        else shots = shots + (long) Math.pow(2, (63 - digitOfShots));
        int leadingZerosShots = Long.numberOfLeadingZeros(shots);
        int leadingZerosShips = Long.numberOfLeadingZeros(ships);
        String shotsEq = ("0".repeat(leadingZerosShots)+Long.toBinaryString(shots));
        String shipsEq = ("0".repeat(leadingZerosShips)+Long.toBinaryString(ships));
        return (shotsEq.charAt(digitOfShots)) == (shipsEq.charAt(digitOfShots));
    }

    public String state(){
        StringBuilder newMap = new StringBuilder();
        int leadingZerosShots = Long.numberOfLeadingZeros(shots);
        int leadingZerosShips = Long.numberOfLeadingZeros(ships);
        String shotsEq = ("0".repeat(leadingZerosShots)+Long.toBinaryString(shots));
        String shipsEq = ("0".repeat(leadingZerosShips)+Long.toBinaryString(ships));
        for (int i=0; i<64; i++){
            if (i>0 && i % 8 == 0) newMap.append("\n");
            char shipState = shipsEq.charAt(i);
            char shotState = shotsEq.charAt(i);
            if (shipState == '1' && shotState == '1' ) {
                newMap.append("☒");} else if (shipState == '1' && shotState == '0' ) {
                newMap.append("☐");} else if (shipState == '0' && shotState == '1' ){
                newMap.append("×");} else if (shipState == '0' && shotState == '0' ) {
                newMap.append(".");
            }
        }
        return newMap.toString();
    }

}