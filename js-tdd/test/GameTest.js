TestCase("GameStarter Test", {
    "test: a cell with 0 neighbours at iteration 0 is dead at iteration 1": function () {

        var cell = new GameOfLife.Cell(0);

        assertTrue(cell.liveNeighbours(0) == 0);
        assertTrue(cell.isDead(1));
    },

    "test: a cell with 1 neighbour is dead in the next iteration": function () {
        var cell = new GameOfLife.Cell(1);

        assertTrue(cell.liveNeighbours(0) == 1);
        assertTrue(cell.isDead(1));
    },

    "test: a cell is alive": function () {
        var cell = new GameOfLife.Cell(1);

        assertFalse(cell.isDead(0));
    },

});