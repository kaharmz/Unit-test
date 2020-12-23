package com.example.unittest

/**
 * This class representing a cuboid data model
 */

class CuboidModel {
    private var width = 0.0
    private var length = 0.0
    private var height = 0.0

    fun getVolume(): Double = width * length * height

    fun getSurfaceArea(): Double {
        val widths = width * length
        val lengths = width * height
        val heights = length * height
        return 2 * (widths + lengths + heights)
    }

    fun getCircumference(): Double = 4 * (width + length + height)

    fun save(width: Double, length: Double, height: Double){
        this.width = width
        this.length = length
        this.height = height
    }
}