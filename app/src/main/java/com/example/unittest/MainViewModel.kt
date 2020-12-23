package com.example.unittest

class MainViewModel(private val cuboidModel: CuboidModel) {

    fun getCircumference() = cuboidModel.getCircumference()

    fun getSurfaceArea() = cuboidModel.getSurfaceArea()

    fun getVolume() = cuboidModel.getVolume()

    fun save(width_ : Double, length_: Double, height_ : Double ){
        cuboidModel.save(width_, length_, height_)
    }
}