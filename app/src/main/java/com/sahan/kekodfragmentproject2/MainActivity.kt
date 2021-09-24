package com.sahan.kekodfragmentproject2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.sahan.kekodfragmentproject2.Fragments.DetailFragment
import com.sahan.kekodfragmentproject2.Fragments.NewOneFragment
import com.sahan.kekodfragmentproject2.Fragments.NewThreeFragment
import com.sahan.kekodfragmentproject2.Fragments.NewTwoFragment
import com.sahan.kekodfragmentproject2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val fragmentList: MutableList<Fragment> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        initHome(false)

    }

    fun initHome(willDelete: Boolean) {
        this.makeTransaction {
            when (willDelete) {
                true -> {
                    fragmentList.forEach { fragment ->
                        it.remove(fragment)
                    }
                }

                false -> {
                    it.add(
                        binding.newOne.id,
                        NewOneFragment.newInstance().also {
                            fragmentList.add(it)
                        }
                    )
                    it.add(
                        binding.newThree.id,
                        NewThreeFragment.newInstance().also {
                            fragmentList.add(it)
                        }
                    )

                    it.add(
                        binding.newOne2.id,
                        NewOneFragment.newInstance().also {
                            fragmentList.add(it)
                        }
                    )



                    it.add(
                        binding.newTwo.id,
                        NewTwoFragment.newInstance().also {
                            fragmentList.add(it)
                        }
                    )

                    it.add(
                        binding.newThree2.id,
                        NewThreeFragment.newInstance().also {
                            fragmentList.add(it)
                        }
                    )

                    it.add(
                        binding.newTwo2.id,
                        NewTwoFragment.newInstance().also {
                            fragmentList.add(it)
                        }
                    )

                    it.add(
                        binding.newThree3.id,
                        NewThreeFragment.newInstance().also {
                            fragmentList.add(it)
                        }
                    )

                    it.add(
                        binding.newOne3.id,
                        NewOneFragment.newInstance().also {
                            fragmentList.add(it)
                        }
                    )
                    it.add(
                        binding.newThree4.id,
                        NewThreeFragment.newInstance().also {
                            fragmentList.add(it)
                        }
                    )

                    it.add(
                        binding.newOne4.id,
                        NewOneFragment.newInstance().also {
                            fragmentList.add(it)
                        }
                    )
                    it.add(
                        binding.newTwo3.id,
                        NewTwoFragment.newInstance().also {
                            fragmentList.add(it)
                        }
                    )
                    it.add(
                        binding.newThree5.id,
                        NewThreeFragment.newInstance().also {
                            fragmentList.add(it)
                        }
                    )

                    it.add(
                        binding.newOne4.id,
                        NewOneFragment.newInstance().also {
                            fragmentList.add(it)
                        }
                    )

                    it.add(
                        binding.newTwo4.id,
                        NewTwoFragment.newInstance().also {
                            fragmentList.add(it)
                        }
                    )

                    it.add(
                        binding.newThree6.id,
                        NewThreeFragment.newInstance().also {
                            fragmentList.add(it)
                        }
                    )
                }
            }
        }
    }

    fun initDetail(willDelete: Boolean, newId : Int? = null){
        this.makeTransaction { it ->
            when(willDelete) {
                true -> {
                    it.remove(fragmentList.removeAt(0))
                    fragmentList.clear()
                }

                false -> {
                    fragmentList.clear()
                    it.add(
                        binding.fragmentDetail.id,
                        DetailFragment.newInstance(newId!!).also {
                            fragmentList.add(it as DetailFragment)
                        }
                    )
                }
            }
        }
    }

    private fun makeTransaction(
        config: (FragmentTransaction) -> Unit
    ) {
        val transaction = supportFragmentManager.beginTransaction()
        config(transaction)
        transaction.commit()


    }


}