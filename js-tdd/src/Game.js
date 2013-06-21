GameOfLife = {};

GameOfLife.Cell = function (numberOfLivingNeighbours) {

            this.liveNeighbours = function (iterationNumber) {
                return numberOfLivingNeighbours;
            }

            this.isDead = function (iterationNumber) {
                return iterationNumber !== 0
            }
};

GameOfLife.Game = function () {

};

GameOfLife.Game.prototype.startGame = function (generation) {
};