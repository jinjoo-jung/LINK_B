import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.linkybproject.home.HomeGraduatefragment
import com.example.linkybproject.home.HomeStudentFragment

private const val NUM_PAGES = 2

class PagerFragmentStateAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeStudentFragment()
            1 -> HomeGraduatefragment()
            else -> HomeStudentFragment()
        }
    }
}