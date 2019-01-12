package io.diaryofrifat.code.examroutine.ui.routine

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import io.diaryofrifat.code.examroutine.R
import io.diaryofrifat.code.examroutine.data.local.Exam
import io.diaryofrifat.code.examroutine.databinding.ItemExamBinding
import io.diaryofrifat.code.examroutine.ui.base.component.BaseAdapter
import io.diaryofrifat.code.examroutine.ui.base.component.BaseViewHolder
import io.diaryofrifat.code.utils.helper.Constants
import io.diaryofrifat.code.utils.helper.DataUtils
import io.diaryofrifat.code.utils.helper.TimeUtils
import java.util.*

class RoutineAdapter : BaseAdapter<Exam>() {
    override fun newViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Exam> {
        return RoutineViewHolder(inflate(parent, R.layout.item_exam))
    }

    override fun isEqual(left: Exam, right: Exam): Boolean {
        return left.id == right.id
    }

    class RoutineViewHolder(binding: ViewDataBinding) : BaseViewHolder<Exam>(binding) {
        private val mBinding = binding as ItemExamBinding

        override fun bind(item: Exam) {
            mBinding.textViewSubjectName.text = item.subjectName

            mBinding.textViewSubjectCode.text = String.format(Locale.ENGLISH,
                    DataUtils.getString(R.string.placeholder_subject_code), item.subjectCode)

            mBinding.textViewTime.text = String.format(Locale.ENGLISH,
                    DataUtils.getString(R.string.placeholder_exam_time),
                    TimeUtils.getFormattedDateTimeString(item.time,
                            Constants.Common.APP_COMMON_TIME_FORMAT),
                    TimeUtils.getFormattedDateTimeString(
                            TimeUtils.getMillisecondsHoursLater(item.time, 3),
                            Constants.Common.APP_COMMON_TIME_FORMAT))

            mBinding.textViewDate.text = TimeUtils.getFormattedDateString(item.time)
        }
    }
}