package fr.sebastienlaunay.kotlinextension1

import android.view.View
import android.view.animation.AnimationUtils
import androidx.core.view.isVisible


fun View.showWithSlideBottomAnimation() {
    val slideUp = AnimationUtils.loadAnimation(this.context, R.anim.slide_up)

    isVisible = true
    startAnimation(slideUp)
}

fun View.hideWithSlideBottomAnimation() {
    val slideBottom = AnimationUtils.loadAnimation(this.context, R.anim.slide_bottom)

    startAnimation(slideBottom)
    isVisible = false
}