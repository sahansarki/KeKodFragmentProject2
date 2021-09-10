package com.sahan.kekodfragmentproject2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.sahan.kekodfragmentproject2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        supportFragmentManager.addOnBackStackChangedListener {

            println("Fragment count in the back stack: ${supportFragmentManager.fragments} " + supportFragmentManager.backStackEntryCount)


        }

        attachFragments()

    }

    private fun addFragments(id: Int, fragment: Fragment) {

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(id, fragment)

        fragmentTransaction.addToBackStack(null)

        fragmentTransaction.setReorderingAllowed(true)
        fragmentTransaction.commit()


    }


    override fun onBackPressed() {
        super.onBackPressed()

        supportFragmentManager.beginTransaction().remove(supportFragmentManager.fragments[0]).commit()

        attachFragments()


    }

    private fun attachFragments() {

        val newOneFragment = NewOneFragment.newInstance("asdasd", "asadadas")
        val newOneFragment2 = NewOneFragment.newInstance("asdasd", "asadadas")
        val newOneFragment3 = NewOneFragment.newInstance("asdasd", "asadadas")
        val newOneFragment4 = NewOneFragment.newInstance("asdasd", "asadadas")
        val newTwoFragment = NewTwoFragment.newInstance("asdasd", "asadadas")
        val newTwoFragment2 = NewTwoFragment.newInstance("asdasd", "asadadas")
        val newTwoFragment3 = NewTwoFragment.newInstance("asdasd", "asadadas")
        val newTwoFragment4 = NewTwoFragment.newInstance("asdasd", "asadadas")
        val newThreeFragment = NewThreeFragment.newInstance("asdfasd", "safdsf")
        val newThreeFragment2 = NewThreeFragment.newInstance("asdfasd", "safdsf")
        val newThreeFragment3 = NewThreeFragment.newInstance("asdfasd", "safdsf")
        val newThreeFragment4 = NewThreeFragment.newInstance("asdfasd", "safdsf")
        val newThreeFragment5 = NewThreeFragment.newInstance("asdfasd", "safdsf")
        val newThreeFragment6 = NewThreeFragment.newInstance("asdfasd", "safdsf")

        addFragments(binding.newOne.id, newOneFragment)
        addFragments(binding.newThree.id, newThreeFragment)
        addFragments(binding.newOne2.id, newOneFragment2)
        addFragments(binding.newTwo.id, newTwoFragment)
        addFragments(binding.newThree2.id, newThreeFragment2)
        addFragments(binding.newTwo2.id, newTwoFragment2)
        addFragments(binding.newThree3.id, newThreeFragment3)
        addFragments(binding.newOne3.id, newOneFragment3)
        addFragments(binding.newThree4.id, newThreeFragment4)
        addFragments(binding.newOne4.id, newOneFragment4)
        addFragments(binding.newTwo3.id, newTwoFragment3)
        addFragments(binding.newThree5.id, newThreeFragment5)
        addFragments(binding.newTwo4.id, newTwoFragment4)
        addFragments(binding.newThree6.id, newThreeFragment6)

    }


}