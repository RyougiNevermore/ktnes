package com.felipecsl.knes

interface APUStepCallback {
  fun onStep(
      cycle: Long,
      framePeriod: Int,
      frameValue: Int,
      frameIRQ: Boolean,
      pulse1Enabled: Boolean,
      pulse1Channel: Int,
      pulse1LengthEnabled: Boolean,
      pulse1LengthValue: Int,
      pulse1TimerPeriod: Int,
      pulse1TimerValue: Int,
      pulse1DutyMode: Int,
      pulse1DutyValue: Int,
      pulse1SweepReload: Boolean,
      pulse1SweepEnabled: Boolean,
      pulse1SweepNegate: Boolean,
      pulse1SweepShift: Int,
      pulse1SweepPeriod: Int,
      pulse1SweepValue: Int,
      pulse1EnvelopeEnabled: Boolean,
      pulse1EnvelopeLoop: Boolean,
      pulse1EnvelopeStart: Boolean,
      pulse1EnvelopePeriod: Int,
      pulse1EnvelopeValue: Int,
      pulse1EnvelopeVolume: Int,
      pulse1ConstantVolume: Int,
      pulse2Enabled: Boolean,
      pulse2Channel: Int,
      pulse2LengthEnabled: Boolean,
      pulse2LengthValue: Int,
      pulse2TimerPeriod: Int,
      pulse2TimerValue: Int,
      pulse2DutyMode: Int,
      pulse2DutyValue: Int,
      pulse2SweepReload: Boolean,
      pulse2SweepEnabled: Boolean,
      pulse2SweepNegate: Boolean,
      pulse2SweepShift: Int,
      pulse2SweepPeriod: Int,
      pulse2SweepValue: Int,
      pulse2EnvelopeEnabled: Boolean,
      pulse2EnvelopeLoop: Boolean,
      pulse2EnvelopeStart: Boolean,
      pulse2EnvelopePeriod: Int,
      pulse2EnvelopeValue: Int,
      pulse2EnvelopeVolume: Int,
      pulse2ConstantVolume: Int,
      triangleEnabled: Boolean,
      triangleLengthEnabled: Boolean,
      triangleLengthValue: Int,
      triangleTimerPeriod: Int,
      triangleTimerValue: Int,
      triangleDutyValue: Int,
      triangleCounterPeriod: Int,
      triangleCounterValue: Int,
      triangleCounterReload: Boolean,
      noiseEnabled: Boolean,
      noiseMode: Boolean,
      noiseShiftRegister: Int,
      noiseLengthEnabled: Boolean,
      noiseLengthValue: Int,
      noiseTimerPeriod: Int,
      noiseTimerValue: Int,
      noiseEnvelopeEnabled: Boolean,
      noiseEnvelopeLoop: Boolean,
      noiseEnvelopeStart: Boolean,
      noiseEnvelopePeriod: Int,
      noiseEnvelopeValue: Int,
      noiseEnvelopeVolume: Int,
      noiseConstantVolume: Int,
      dmcEnabled: Boolean,
      dmcValue: Int,
      dmcSampleAddress: Int,
      dmcSampleLength: Int,
      dmcCurrentAddress: Int,
      dmcCurrentLength: Int,
      dmcShiftRegister: Int,
      dmcBitCount: Int,
      dmcTickPeriod: Int,
      dmcTickValue: Int,
      dmcLoop: Boolean,
      dmcIrq: Boolean,
      output: Float
  )
}