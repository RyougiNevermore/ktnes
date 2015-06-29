package android.emu6502.instructions.impl

import android.emu6502.CPU
import android.emu6502.instructions.BaseInstruction
import android.emu6502.instructions.Instruction

/** Branch on Carry Clear */
final class BCC(private val cpu: CPU) : BaseInstruction(Instruction.BCC, cpu.instructionList) {
  override fun branch() {
    val offset = cpu.popByte()
    if (!cpu.carry()) {
      cpu.jumpBranch(offset)
    }
  }
}

